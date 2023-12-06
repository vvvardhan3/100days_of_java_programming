package decisionMakingStatement;

public class nestedif {
    public static void main(String[] args) {
    
        String status = "pass";

        if (status.equals("pass")) {
            System.out.println("You have cleared round 1. Please wait for further round 2");
            String round1status = "pass";
            if (round1status.equals("pass")) {
                System.out.println("You have cleared round 2. Please wait for the further HR round");
                String round2Status = "fail";
                if (round2Status.equals("pass")) {
                    System.out.println("You have cleared the HR round");
                    System.out.println("Congratulations!");
                } else {
                    System.out.println("Can't offer the job!");
                }
            }
        }
    }
}
