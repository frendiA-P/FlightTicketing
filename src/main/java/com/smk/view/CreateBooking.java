package com.smk.view;

import com.smk.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.awt.*;

@PageTitle("Create Booking")
@Route(value = "create-booking", layout = MainView.class)
public class CreateBooking extends VerticalLayout {

    public CreateBooking() {
        createForm();
    }

    private void createForm(){
        setAlignItems(Alignment.STRETCH);
        ComboBox fromComboBox = new ComboBox("Dari");
        ComboBox toComboBox = new ComboBox("ke");

        DatePicker departureDatePicker = new DatePicker("Tanggal Keberangkatan");

        DatePicker arrivalDatePicker = new DatePicker("Tanggal Kepulangan");

        Button searchButton = new Button("Search");

        searchButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        add(fromComboBox, toComboBox, departureDatePicker, arrivalDatePicker, searchButton);

    }


}
