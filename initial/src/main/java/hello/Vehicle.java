package hello;

import org.springframework.ui.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Year;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;
    private String vin;
    private String bodyStyle;
    //private LocalDate purchaseDate;
    //private int odometer;
    //private Year year;
    //private String make;
    //private String model;
    //private String titleNumber;
    //private LocalDate expiration;


    /*
    Vehicle Information:
        VIN:                        5N1AT2MT7HC555555
        Vehicle Status:             New
        Purchase Date:              2017-12-05
        Year:                       2017
        Make:                       NISS
        Model:                      ROGUE S SL
        Body Style:                 MP
        Color:                      GRY/ GRY
        Gross Weight:
        Fuel Type:                  G
        Engine Type:                CYLINDERS
        Cylinders:                  4
        Current Odometer:           13
        Odometer Exception:
    Title Information:
        ELT:                        Y
        Title Number:               774442173474555
        Title Status:               OK
        Title Date:                 2017-12-21
        Back TAVT:                  $0.00
    Registration Information:
        Plate Number:               RES3176
        Category:                   AA
        Use:
        Expiration:                 2018-06-28
        Status:                     ACT
    Lessee Information:
    Owner Information:
        Type:                       INDIVIDUAL
        ID:                         00005945555
        Name:                       SONJA PETERS DOE
        Physical Address:
            555 LAKEVIEW ST
            CITY , GA 30555
            FULTON

        Type:                       INDIVIDUAL
        ID:                         70025165566
        Name:                       CATHY L JACOBS
        Physical Address:
            777 RIVERVIEW ST
            ACWORTH, GA 30555
            FULTON
        Mailing Address:
    Lien Information:
        ELT:                        N
        Customer ID:                001102277552
        Lien Name:                  FIFTH THIRD BANK
        Physical Address:
            5001 KINGSLEY DR UNIT MD
            1MOB1S
            CINCINNATI , OH 452637548
        Mailing Address:
            PO BOX 674
            WILMINGTON , OH 451770674
            */
}
