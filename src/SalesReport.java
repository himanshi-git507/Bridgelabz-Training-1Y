public class SalesReport {
    public void printSalesReport() {
        System.out.println("Region-wise Sales Report");
        System.out.println("North: ₹5,00,000");
        System.out.println("South: ₹4,50,000");
    }
}

package com.company.analytics.hr;

public class EmployeeReport {
    public void printEmployeeReport() {
        System.out.println("Employee Performance Report");
        System.out.println("Amit: Excellent");
        System.out.println("Neha: Very Good");
    }
}

package com.company.analytics;

import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class Main {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();
        System.out.println("===== Company Combined Report =====");
        sales.printSalesReport();
        hr.printEmployeeReport();
    }
}