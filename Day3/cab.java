import java.util.Scanner;
class cab {
    int fare;
    int distance;      

    public cab() {
        fare = 25;
    }

    
    public cab(int amt) {
        fare = amt;
    }

    
    public cab(cab ob2) {  
        fare = ob2.fare;   
    }

    void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}

class RideCab {
    public static void main(String[] args) {
        int cd;     
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();
        if(cd > 5) {
            cab ob = new cab(25 + 10 * (cd - 5));
            System.out.print("Enter the distance travelled: ");
            ob.distance = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.distance;
            
            ob.showFare();
        }
        else {
            cab ob = new cab();
            System.out.print("Enter the distance travelled: ");
            ob.distance = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.distance;
            
            ob.showFare();

            cab ob1 = new cab(ob);
            ob1.showFare();
        }

        
    }
}
