package insertion.sort;

/**
 *
 * @author Alexandru Cristea
 */

public class InsertionSort { 
    // sorteaza array-ul primit ca parametru cu metoda "sortare prin insertie"
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            /*
            Muta elementele din array care sunt mai mari decat "key", 
            unul cate unul, cu o pozitie in avans fata de pozitia lor curenta
            */            
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
  
    /* afisare array*/
  public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    // metoda principala / main
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; //declarare sir de valori
  
        InsertionSort ob = new InsertionSort(); //creare obiect InsertionSort
        ob.sort(arr); //apel metoda sort cu parametru de intrare "arr"
  
        printArray(arr); //apel metoda pintArray pentru printare rezultat
    } 
}
    
    

