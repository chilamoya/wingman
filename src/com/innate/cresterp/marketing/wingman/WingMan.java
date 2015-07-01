package com.innate.cresterp.marketing.wingman;


import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.MultiList;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class WingMan {

    private Form current;
    

    public void init(Object context) {
        try {
            Resources theme = Resources.openLayered("/theme");
            UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
        } catch(IOException e){
            e.printStackTrace();
        }
        // Pro users - uncomment this code to get crash reports sent to you automatically
        /*Display.getInstance().addEdtErrorHandler(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                evt.consume();
                Log.p("Exception in AppName version " + Display.getInstance().getProperty("AppVersion", "Unknown"));
                Log.p("OS " + Display.getInstance().getPlatformName());
                Log.p("Error " + evt.getSource());
                Log.p("Current Form " + Display.getInstance().getCurrent().getName());
                Log.e((Throwable)evt.getSource());
                Log.sendLog();
            }
        });*/
    }
    
    public void start() {
        if(current != null){
            current.show();
            return;
        }
        Form form1 = new Form("One");
        form1.setLayout(new BorderLayout());
        
        Button bt1 = new Button("Contacts");
        bt1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        Button bt2 = new Button("Group");
        bt2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        Button bt3 = new Button("Task");
        bt3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                
            }
        });
        
        Container cn = new Container();
        cn.setLayout(new BoxLayout(BoxLayout.X_AXIS));
        cn.addComponent(bt1);
        cn.addComponent(bt2);
        cn.addComponent(bt3);
        
        
        MultiList list = new MultiList();
        list.setModel(new DefaultListModel(/*details()*/));
        list.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                 
            }
        });
        
        
        
        
        form1.addComponent(BorderLayout.NORTH, cn);
        form1.addComponent(BorderLayout.CENTER, list);
       // form1.addComponent(new Label("Hi World"));
        form1.show();
    }
    
    /*public Vector details(){
        Vector vec = new Vector();
        Hashtable name = new Hashtable();
        Hashtable email = new Hashtable();
        Hashtable mobile = new Hashtable();
        Hashtable company = new Hashtable();
        Hashtable address = new Hashtable();
        
        name.put("Line1", "Name");
        name.put("Line2", "Simba");
        email.put("Line1", "Email");
        email.put("Line2", "scmupfururirwa@gmail.com");
        mobile.put("Line1", "Mobile");
        mobile.put("Line2", "+263 77 9309 963");
        company.put("Line1", "Company");
        company.put("Line2", "Innate Solutions");
        address.put("Line1", "Address");
        address.put("Line2", "1 Orchard Close Avondale");
        vec.addElement(name);
        vec.addElement(email);
        vec.addElement(mobile);
        vec.addElement(company);
        vec.addElement(address);
        
        return vec;
        
    }*/

    public void stop() {
        current = Display.getInstance().getCurrent();
    }
    
    public void destroy() {
    }

}
