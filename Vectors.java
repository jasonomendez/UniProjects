import java.util.*;
public class Vectors { 

    double x, y , z;  
    Scanner sc = new Scanner(System.in);

    //constuctor 
    public Vectors() {
        //empty constructor 
        this.x = 0; 
        this.y = 0;
        this.z = 0;  
    }

    public void vectorsTerminal() { 
        //prompt user for vector choices 
        // got to call on terminal ascii 
        // use switch statement for  vector choices  
        // each choice call termianl ascii  
        String choseVectors = "What would you like to do with vectors?" + 
        "\n1.Add vectors     " +    
        "\n2.Subtract vectors" +  
        "\n3.Multiply vectors" +
        "\n4.Divide vectors  " +
        "\n5.Dot product     " +
        "\n6.Cross product   " + 
        "\n7.distance between" +  
        "\n8.Find angle      " +
        "between vectors     "; 
        
        TerminalResponse vectorsTerminal = new TerminalResponse(choseVectors);
        vectorsTerminal.terminalAscii(); 
        boolean validNumbers = false; 

        while (!validNumbers) {  
            String strVectorChoice = sc.nextLine(); 
            try {
            int vectorChoice = Integer.parseInt(strVectorChoice); 
            validNumbers = true;
            switch (vectorChoice) {
                case 1:
                    //add vectors  
                    // call vector object for vectoraddition method 
                    additionVectors();
                    break; 
                case 2:
                    //subtract vectors 
                    break; 
                case 3:
                    //multiply vectors 
                    break; 
                case 4:
                    //divide vectors 
                    break; 
                case 5:
                    //dot product 
                    break; 
                case 6:
                    //cross product 
                    break; 
                case 7:
                    //distance between vectors 
                    break; 
                case 8:
                    //find angle between vectors 
                    break; 
                default:
                    throw new NumberFormatException();
            }
        } catch (NumberFormatException e) { 

            String wrongInput = "Invalid input. Please enter a number between 1 and 8."; 
            TerminalResponse wrongInputTerminal = new TerminalResponse(wrongInput);
            wrongInputTerminal.terminalAscii();
        } 
    }


    }

    // method for adding vectors 
    public void additionVectors() {
        //add vectors  
        System.out.println("You chose vector addition.");
        System.out.println("How many vectors would you like to add?");
        int numVectors = sc.nextInt();

        // Create arrays to store the components of each vector
        double[][] components = new double[numVectors][];

        System.out.println("How many components does each vector have?");
        int numComponents = sc.nextInt();

        // Loop through each vector
        for (int i = 0; i < numVectors; i++) {
            // Create array to store components for this vector
            components[i] = new double[numComponents];

            // Prompt the user for the components of the current vector
            for (int j = 0; j < numComponents; j++) {
                char componentLetter = (char) ('x' + j); // Use letters x, y, z, ...
                System.out.println("Enter the " + componentLetter + " component of vector " + (i + 1) + ":");
                components[i][j] = sc.nextDouble();
            }
        }

        // Add the vectors
        double[] result = new double[numComponents];
        for (int i = 0; i < numVectors; i++) {
            for (int j = 0; j < numComponents; j++) {
                result[j] += components[i][j];
            }
        }

        // Print the result
        String resultVector = "The resulting vector is: { "; 
        for (int j = 0; j < numComponents; j++) {  
            if (j == numComponents - 1) {
                resultVector += result[j] + " ";
                break; 
            } 
            resultVector += result[j] + ", " ;
        }  
        resultVector += "}";

        TerminalResponse resultVectorTerminal = new TerminalResponse(resultVector); 
        resultVectorTerminal.terminalAscii();

        
    }
        

    // method for subtracting vectors
    public void subtractionVectors() {
        //subtract vectors 
    }

    // method for multiplying vectors
    public void multiplyVectors() {
        //multiply vectors 
    }

    // method for dividing vectors
    public void divideVectors() {
        //divide vectors 
    }

}