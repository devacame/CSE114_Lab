package src.Lab6;

public class Emergency {

    public static String emergency(String emergencyCall) {
        int i = 1;
        String name = "", event = "", where = "";
        for (String sentence : emergencyCall.split("\\.")) {
            if (i == 1) {
                name = sentence.substring(18);
                i++;
            } else if (i == 2) {
                event = sentence.substring(18);
                i++;
            } else {
                where = sentence.substring(16);
            }
        }
        return event + " at " + where + " reported by " + name;
    }
    public static void main(String[] args) {
        String[] input = {
            "Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road.",
            "Hello, my name is Mary Smith. I need to report a car accident. Please come to 2635 Main Street.",
            "Hello, my name is Joe Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue."
        };
        String[] output = {
            "a fire at 100 Circle Road reported by John Smith",
            "a car accident at 2635 Main Street reported by Mary Smith",
            "a robbery at 3595 Oakwood Avenue reported by Joe Bell"
        };
        for (int i=0;i<input.length;i++) {
            String response = emergency(input[i]);
            System.out.println(response + " is" + (response.equals(output[i]) ? "" : " not") + " valid.");
        }
    }
}
