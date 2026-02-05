public class SplitStuff
{
    public static void main(String [] args)
    {
        String names = "Emily, Cecilia, Suzie, Greta, LP, Borus, Princess";
        String [] listOfNames = names.split(", ");
        
        for(String name : listOfNames)
        {
            System.out.println(name);
        }
        
    }
}