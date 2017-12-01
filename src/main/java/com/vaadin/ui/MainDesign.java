package com.vaadin.ui;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.declarative.Design;

/**
 * !! DO NOT EDIT THIS FILE !!
 * <p>
 * This class is generated by Vaadin Designer and will be overwritten.
 * <p>
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class MainDesign extends HorizontalLayout {
    protected Image image;
    protected Label nameLabel;
    protected Button menuButton;
    protected CssLayout menu;
    protected Button dashboard;
    protected Button reports;
    protected Button steps_linechart;
    protected Button activity_barchart;
    protected Button download_data;
    protected Button settings;
    protected Button logout;
    protected Label viewTitle;
    protected RadioButtonGroup<String> timeRadioButtonGroup;
    protected CssLayout content;
    protected CssLayout contentArea;

    public MainDesign() {
        Design.read(this);
    }
}
