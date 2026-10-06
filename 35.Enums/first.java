// Enum in java

enum Status{
    running, failed, pending, sucess;
}

public class first {
    public static void main(String[] args) {
        Status s1=Status.running;
        System.out.println(s1);//running
        System.out.println(s1.ordinal());

        Status s2=Status.failed;
        System.out.println(s2);//failed
        System.out.println(s2.ordinal());

        Status s3=Status.pending;
        System.out.println(s3);
        System.out.println(s3.ordinal());//2

        Status ss[]=Status.values();
        System.out.println(ss[0]);
        System.out.println(ss[1]);

        // printing all:-
        for(Status s : ss){
            System.out.println(s+" : "+s.ordinal());
        }

        
    }
}

// Actually Status is a class here and all four are objects of...class status.
// running, failed, pending, sucess are final constant;