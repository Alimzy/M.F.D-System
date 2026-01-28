import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class MultiFuelDispenserSystem{
public static void main(String... args){
Scanner input = new Scanner(System.in);
LocalDate date = LocalDate.now();

double liter = 0;

ArrayList<String> productArray = new ArrayList<>();
ArrayList<Double> litersArray = new ArrayList<>();
ArrayList<Double> amountArray = new ArrayList<>();


while(true){

String mainMenu = """
        WELCOME TO ALIMZY STATION
    
    1. Buy Petroleum
    2. Show Transaction History
    3. Exit programme
        """;
System.out.println(mainMenu);

System.out.println("Enter option: ");
int optionMain = input.nextInt();

switch(optionMain){
    case 1:
        System.out.println(displayPetroleumMenu());
        
        System.out.println("Choose fuel type");
        int fuelType = input.nextInt();
        
        switch(fuelType){
            case 1:
                double amountPetrol = 0;

                String product = "fuel";

                input.nextLine();
                System.out.println("purchase Petrol by Liter or Amount ");
                String purchaseTypePetrol = input.nextLine();
            
                if(purchaseTypePetrol.equalsIgnoreCase("liter")){

                    System.out.println("Enter amount of liter: ");
                    double amountOfLiterPetrol = input.nextInt();

                   amountPetrol =  calculatePetroleumLiter(amountOfLiterPetrol);
                   displayReceiptLiter(product,amountPetrol,amountOfLiterPetrol, date);
//                    saveTransactions(product,amountOfLiterPetrol,amountPetrol);
                    productArray.add(product);
                    litersArray.add(amountOfLiterPetrol);
                    amountArray.add(amountPetrol);


                }else if(purchaseTypePetrol.equalsIgnoreCase("amount")){
                
                    System.out.println("Enter amount: ");
                    amountPetrol = input.nextDouble();

                    amountPetrol = calculatePetroleumAmount(amountPetrol);
                    liter = amountPetrol / 650;
                    displayReceiptAmount(product,amountPetrol,liter,date);
//                    saveTransactions(product,liter,amountPetrol);
                    productArray.add(product);
                    litersArray.add(liter);
                    amountArray.add(amountPetrol);

                }
                  break;
            case 2:
                 product = "Diesel";
                double amountDiesel = 0;
                input.nextLine();
                System.out.println("Liter or Amount to purchase Diesel ");
                String purchaseTypeDiesel = input.nextLine();
                if(purchaseTypeDiesel.equalsIgnoreCase("liter")){

                    System.out.println("Enter amount of liter: ");
                    double amountOfLiterDiesel = input.nextInt();

                   amountDiesel =  calculateDieselLiter(amountOfLiterDiesel);
                   displayReceiptLiter(product,amountDiesel,amountOfLiterDiesel, date);
//                   saveTransactions(product,amountOfLiterDiesel,amountDiesel);
                    productArray.add(product);
                    litersArray.add(amountOfLiterDiesel);
                    amountArray.add(amountDiesel);

                }else if(purchaseTypeDiesel.equalsIgnoreCase("amount")){
                
                    System.out.println("Enter amount: ");
                    amountDiesel = input.nextDouble();

                    amountDiesel = calculateDieselAmount(amountDiesel);
                    liter = amountDiesel / 720;
                    displayReceiptAmount(product,amountDiesel,liter,date);
//                    saveTransactions(product,liter,amountDiesel);
                    productArray.add(product);
                    litersArray.add(liter);
                    amountArray.add(amountDiesel);

                }
                break;
            case 3:
                 product = "Kerosene";
                double amountKerosene = 0;
                input.nextLine();
                System.out.println("Liter or Amount to purchase K ");
                String purchaseTypeKerosene = input.nextLine();
                if(purchaseTypeKerosene.equalsIgnoreCase("liter")){

                    System.out.println("Enter amount of liter: ");
                    double amountOfLiterKerosene = input.nextInt();

                   amountKerosene =  calculateKeroseneLiter(amountOfLiterKerosene);
                   displayReceiptLiter(product,amountKerosene,amountOfLiterKerosene, date);
//                    saveTransactions(product,amountOfLiterKerosene,amountKerosene);
                    productArray.add(product);
                    litersArray.add(amountOfLiterKerosene);
                    amountArray.add(amountKerosene);

                }else if(purchaseTypeKerosene.equalsIgnoreCase("amount")){
                
                    System.out.println("Enter amount: ");
                     amountKerosene = input.nextDouble();

                    amountKerosene = calculateKeroseneAmount(amountKerosene);
                    liter = amountKerosene / 550;
                    displayReceiptAmount(product,amountKerosene,liter,date);
//                    saveTransactions(product,liter,amountKerosene);
                    productArray.add(product);
                    litersArray.add(liter);
                    amountArray.add(amountKerosene);

                }
                break;
            
            case 4:
                product = "Gas";
                double amountGas = 0;
                input.nextLine();
                System.out.println("Liter or Amount to purchase Gas ");
                String purchaseType = input.nextLine();
                if(purchaseType.equalsIgnoreCase("liter")){

                    System.out.println("Enter amount of liter: ");
                    double amountOfLiterGas = input.nextInt();

                   amountGas =  calculateGasLiter(amountOfLiterGas);
                   displayReceiptLiter(product,amountGas,amountOfLiterGas, date);
//                    saveTransactions(product,amountOfLiterGas,amountGas);
                    productArray.add(product);
                    litersArray.add(amountOfLiterGas);
                    amountArray.add(amountGas);

                }else if(purchaseType.equalsIgnoreCase("amount")){
                
                    System.out.println("Enter amount: ");
                    amountGas = input.nextDouble();

                    amountGas = calculateGasAmount(amountGas);
                    liter = amountGas / 480;
                    displayReceiptAmount(product,amountGas,liter,date);
//                    saveTransactions(product,liter,amountGas);
                    productArray.add(product);
                    litersArray.add(liter);
                    amountArray.add(amountGas);

                }
            break;
        }break;

 
    case 2:
        for(int counter = 0; counter < productArray.size();counter++){
            System.out.println("=".repeat(50));
            System.out.println("= Product: " + productArray.get(counter));
            System.out.println("= Amount: " + amountArray.get(counter));
            System.out.println("= Liters: " + litersArray.get(counter));
            System.out.println("= Date: " + date);
            System.out.println("=".repeat(50));
                     


        }break;
            
    case 3:
        break;
}
}

}



public static String displayPetroleumMenu(){
String petroleumMenu = """
    Available Petroleum

        1.  Petrol  =>  650/Liter
        2.  Diesel  =>  720/Liter
        3.  Kerosene => 550/Liter  
        4.  Gas     =>  480/Liter
    """;
return petroleumMenu;
}

public static double calculatePetroleumLiter(double amountOfLiter){
double amountByLiterPetrol = 650 * amountOfLiter;

return amountByLiterPetrol;
} 

public static double calculatePetroleumAmount(double amountForPetrol){
double amountPetrol = 0;
if(amountForPetrol < 650){
System.out.print("Amount must be above a liter price !!!");
}else if(amountForPetrol > 32500){
System.out.println(("Amount must not exceed price of 50 liters"));

}else{
amountPetrol = amountForPetrol;
}

return amountPetrol;
}

public static double calculateDieselLiter(double amountLiter){
double amountByLiterDiesel = 720 * amountLiter;

return amountByLiterDiesel;
} 


public static double calculateDieselAmount(double amountOfDiesel){
double amountDiesel = 0;
if(amountOfDiesel < 720){
System.out.print("Amount must be above a liter price !!!");
}else if(amountOfDiesel > 36000){
System.out.println(("Amount must not exceed price of 50 liters"));

}else{
amountDiesel = amountOfDiesel;
}

return amountDiesel;
}

public static double calculateKeroseneLiter(double amountByLiter){
double amountByLiterKerosene = 550 * amountByLiter;

return amountByLiterKerosene;
} 


public static double calculateKeroseneAmount(double amountOfKerosene){
double amountKerosene = 0;
if(amountOfKerosene < 550){
System.out.print("Amount must be above a liter price !!!");
}else if(amountOfKerosene > 27500){
System.out.println(("Amount must not exceed price of 50 liters"));

}else{
amountKerosene = amountOfKerosene;
}

return amountKerosene;
}

public static double calculateGasLiter(double amountOfLiter){
double amountByLiterGas = 480 * amountOfLiter;

return amountByLiterGas;
} 


public static double calculateGasAmount(double amountOfLiter){
double amountGas = 0;
if(amountOfLiter < 480){
System.out.print("Amount must be above a liter price !!!");
}else if(amountOfLiter > 24000){
System.out.println(("Amount must not exceed price of 50 liters"));

}else{
amountGas = amountOfLiter;
}

return amountGas;
}

public static void displayReceiptLiter(String product, double amount, double liters,LocalDate date){

System.out.println("=".repeat(50));
System.out.println("= Product: " + product);
System.out.println("= Amount: " + amount);
System.out.println("= Liters: " + liters);
System.out.println("= Date: " + date);
System.out.println("=".repeat(50));

}

public static void displayReceiptAmount(String product, double amount,double liters,LocalDate date){

System.out.println("=".repeat(50));
System.out.println("= Product: " + product);
System.out.println("= Amount: " + amount);
System.out.println("= Date: " + date); 
System.out.println("=".repeat(50));


}

//public static void saveTransactions(String product,double amount, double liters){
//
//ArrayList<String> productArray = new ArrayList<>();
//ArrayList<Double> litersArray = new ArrayList<>();
//ArrayList<Double> amountArray = new ArrayList<>();
//productArray.add(product);
//litersArray.add(liters);
//amountArray.add(amount);
//
//}
//
}   
