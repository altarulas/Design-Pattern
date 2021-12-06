import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrinterUser extends PrinterDetails implements  Printer{

    String text;
    String type;


    @Override
    public void Display() {

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your text: ");
            text = bufferedReader.readLine();
            System.out.println("\n");

            System.out.print("Enter printer type: ");
            type = bufferedReader.readLine();
            System.out.println("printing...");

            setText(text);
            setType(type);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void CharPrinter() {

        if(type.equals("char"))
        {
            for(int i=0; i<text.length();i++)
            {
                char c = text.charAt(i);
                System.out.println(c);
            }
        }

    }

    @Override
    public void BufferPrinter() {

        if(type.equals("buffer"))
        {
            char[] ch = new char[text.length()];

            for (int i = 0; i < text.length(); i++) {
                ch[i] = text.charAt(i);
            }

            System.out.println(ch);
        }

    }

}
