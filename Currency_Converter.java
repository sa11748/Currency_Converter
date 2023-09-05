
package com.example.currencyconverter;

import java.util.*;
import java.text.DecimalFormat;

public class Currency_Converter {
    public static void main(String[] args)
    {
      double rupee,dollar,pound,code,euro,KWD;
      DecimalFormat f = new DecimalFormat();

      Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my currency converter! \n Enter the currency! \n 1.Rupees\n 2.Dollar\n 3.Pound\n 4.Euro\n 5.Kuwaiti Dinar");
        code = sc.nextInt();

        if(code == 1) {
            System.out.println("Enter amount in rupees:");
            rupee = sc.nextDouble();
            dollar = rupee / 82.72;
            System.out.println("Dollar : $ " + f.format(dollar));
            pound = rupee / 104.12;
            System.out.println("Pound : £ " + f.format(pound));
            euro = rupee / 89.32;
            System.out.println("Euro : € " + f.format(euro));
            KWD = rupee / 267.56;
            System.out.println("KWD : د.ك " + f.format(KWD));
        }
        else if (code == 2)
        {
            System.out.println("Enter amount in dollar:");
            dollar = sc.nextDouble();
            rupee = dollar * 82.72;
            System.out.println("Rupee : ₹ " + f.format(rupee));
            pound = dollar * 0.79;
            System.out.println("Pound : £ " + f.format(pound));
            euro = dollar * 0.93;
            System.out.println("Euro : € " + f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("KWD : د.ك " + f.format(KWD));

        }
        else if (code == 3)
        {
            System.out.println("Enter amount in pound:");
            pound = sc.nextDouble();
            dollar = pound * 1.26;
            System.out.println("Dollar : $ " + f.format(dollar));
            rupee = pound * 104.12;
            System.out.println("Rupee : ₹ " + f.format(rupee));
            euro = pound * 1.17;
            System.out.println("Euro : € " + f.format(euro));
            KWD = pound * 0.39;
            System.out.println("KWD : د.ك " + f.format(KWD));
        }
        else if (code == 4)
        {
            System.out.println("Enter amount in Euro :");
            euro = sc.nextDouble();
            dollar = euro * 1.08;
            System.out.println("Dollar : $ " + f.format(dollar));
            pound = euro * 0.86;
            System.out.println("Pound : £ " + f.format(pound));
            rupee = euro * 89.32;
            System.out.println("Rupee : ₹ " + f.format(rupee));
            KWD = euro * 0.33;
            System.out.println("KWD : د.ك " + f.format(KWD));
        }
        else if (code == 5)
        {
            System.out.println("Enter amount in KWD:");
            KWD = sc.nextDouble();
            dollar = KWD * 3.23;
            System.out.println("Dollar : $ " + f.format(dollar));
            pound = KWD * 2.57;
            System.out.println("Pound : £ " + f.format(pound));
            euro = KWD * 3.00;
            System.out.println("Euro : € " + f.format(euro));
            rupee = KWD * 267.56;
            System.out.println("Rupee : ₹ " + f.format(rupee));

        }
        else
        {
            System.out.println("Invalid Code!");
        }
    }
    }
