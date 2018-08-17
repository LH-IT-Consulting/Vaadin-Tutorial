package de.hitc.playground.vaadin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

public class VaadinUI  extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Welcome to Vaadin 8!"));
    }
}
