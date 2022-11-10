package zipcode;

/**
 * Hello world!
 *
 */
public class ZipCode 
{
    public static void main( String[] args )
    { 
        new ZipCode().execute("./ClassTempl.txt", "Chapter1");
    }

    private void execute(String ...args) {
        for (String s : args) System.out.println(s); System.out.println(args.length);
        if (args.length < 2) terminate("wrong arguments to command");
        Command op = Command.getOp(args[1]);
        if (op == Command.CLASSNEW) {
            op.execute(args);            
        }
    }

    private void terminate(String string) {
        System.err.println(string);
        System.exit(-1);
    }

}
