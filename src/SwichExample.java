public class SwichExample {

    public static void main(String[] args) {

        int month =2;

        switch (month){

            case 1 :

                System.out.println("Jan");

            case 2 : {
                System.out.println("--------");
                System.out.println("Feb");
                System.out.println("--------");

                break;
            }
            case 3 :
                System.out.println("March");
                break;

            default:
                System.out.println("Unknown");

        }

        System.out.println("Done");

    }

}


