package de.hitc.playground.vaadin.frontend;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

public class WebConfig {

    @WebServlet("/*")
    @VaadinServletConfiguration(
            ui = VaadinUI.class, productionMode = false
    )
    public static class WebappVaadinServlet extends VaadinServlet {}

}
