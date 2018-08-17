package de.hitc.playground.vaadin.frontend;

import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.ui.Grid;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import de.hitc.playground.vaadin.backend.Customer;
import de.hitc.playground.vaadin.backend.CustomerService;

import java.util.List;

public class VaadinUI  extends UI {

    private CustomerService service = CustomerService.getInstance();
    private Grid<Customer> grid = new Grid<>(Customer.class);

    private TextField filterText = new TextField();

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        final VerticalLayout layout = new VerticalLayout();

        filterText.setPlaceholder("filter by name...");
        filterText.addValueChangeListener(e -> updateList());
        filterText.setValueChangeMode(ValueChangeMode.LAZY);

        grid.setColumns("firstName","lastName", "email");
        layout.addComponent(grid);

        updateList();

        setContent(layout);
    }

    public void updateList() {
        List<Customer> customers = service.findAll();
        grid.setItems(customers);
    }
}
