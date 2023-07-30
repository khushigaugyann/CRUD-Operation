import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("Enter Number of elements do you wants :");
        int n=sc.nextInt();
        // creation of array
        for(int i=0;i<n;i++){
            System.out.println("Enter Element :");
            arr[i]=sc.nextInt();
        }
            // read array
        System.out.println("Array elements are :-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        // update an array element 
        System.out.print("\nEnter a value which you want to update : ");
        int num=sc.nextInt();
        System.out.print("\n Enter index value : ");
        int idx=sc.nextInt();
        arr[idx]=num;
        System.out.println("\nUpdated Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        //  Delete an array elemamnt
        System.out.print("\nEnter a value which you want to delete : ");
        int ele=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }break;
            } else if(i<0||i>n){
                System.out.println("You Entered Wrong value !!");
                break;
            }
        }
        System.out.println("After delete an element of an Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    sc.close();
    }
}
