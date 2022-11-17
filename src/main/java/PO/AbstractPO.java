package PO;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.sql.DriverManager;

public class AbstractPO {
    public HTMLInputElement catalog;

    public AbstractPO(){
        PageFactory.initElements((SearchContext) DriverManager.getDrivers(), this);
    }

}
