/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innate.cresterp.marketing.wingman;

import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.TextArea;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.spinner.DateSpinner;
import com.innate.cresterp.marketing.wingman.tasks.Task;

/**
 *
 * @author Tafadzwa
 */
public class TaskDetails {

    private Task task;

    public TaskDetails(Task task) {
        this.task = task;
    }

    public Form generateFormDetails() {
        final Form form = new Form("Task Details");
        form.setLayout(new BorderLayout());

        FlowLayout layout = new FlowLayout();
        layout.setFillRows(true);
        final Container cnt = new Container(layout);
        final TextField shortname = new TextField();
        final TextArea details = new TextArea();
        final TextArea contacts = new TextArea();
        final TextField dueDate = new TextField();

        shortname.setText(task.getName());
        shortname.setHint("Enter short name");
        details.setText(task.getDetails());
        details.setHint("Enter Details");
        contacts.setText(task.getContacts());
        contacts.setHint("Enter name,mobile,email seperated by commas");
        dueDate.setText(task.getDate());
        dueDate.setHint("Enter Due Date");

        Button save = new Button("Save");
        CheckBox completed = new CheckBox("Completed");
        Container btnCnt = new Container(new FlowLayout());
        btnCnt.addComponent(completed);
        btnCnt.addComponent(save);

        cnt.addComponent(shortname);
        cnt.addComponent(details);
        cnt.addComponent(contacts);
        cnt.addComponent(dueDate);
        cnt.addComponent(btnCnt);

        form.addComponent(BorderLayout.CENTER, cnt);
          Command back = new Command("Back") {
            @Override
            public void actionPerformed(ActionEvent evt) {
                 form.showBack();
            }
        };

        form.addCommand(back);
        return form;

    }

}
