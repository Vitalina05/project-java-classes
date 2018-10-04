package tasks;
public class RemoveSpacesInString {
        public static void main(String args[]){
            String strInput = new String(" This is a small task for removing spaces in the sentence ");
            String strOutput = strInput.replaceAll(" ", "");

            System.out.print("Result: " + strOutput);
        }
}
