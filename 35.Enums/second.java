// how it works when compared:-

enum Status{
    running, failed, pending, sucess;
}
// public class second {
//     public static void main(String[] args) {
//         Status s=Status.pending;

//         if(s==Status.running){
//             System.out.println("All Good");
//         }
//         else if(s==Status.pending){
//             System.out.println("Please Wait");
//         }
//         else if(s==Status.failed){
//             System.out.println("Try Again");
//         }
//         else{
//             System.out.println("Done");
//         }
//     }
// }

// switch also support enum:-

public class second{
    public static void main(String[] args) {
        Status s=Status.running;

        switch (s) {
            case running:
                System.out.println("All good");
                break;

            case pending:
                System.out.println("Wait");
                break;    
        
            case failed:
                System.out.println("try again");
                break;

            default:
                System.out.println("Done");
                break;
        }
    }
}
