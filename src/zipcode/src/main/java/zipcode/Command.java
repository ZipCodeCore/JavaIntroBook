package zipcode;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Command {
    CLASSNEW("classcreate"){
        public void execute(String[] args) {
            final Path filePath = Path.of("./","ClassTempl.txt");
            String templ;
            try {
                templ = Files.readString(filePath);
                String classname = args[0];
                String classfilename = classname+".java";
                PrintWriter result = new PrintWriter(classfilename);
                result.printf(templ, classname, classname);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    },
    ERR("error"){
        public void execute(String[] args) {
        }
    },

    ;

    public static Command getOp(String string) {
        return null;
    }

    abstract void execute(String[] args);

    private String name;
    private static Boolean _DEBUG = false;

    private static final Map<String,Command> ENUM_MAP;

    Command (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Build an immutable map of String name to enum pairs.
    // Any Map impl can be used.

    static {
        Map<String,Command> map = new ConcurrentHashMap<String, Command>();
        for (Command instance : Command.values()) {
            map.put(instance.getName().toLowerCase(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Command get (String name) {
        return ENUM_MAP.getOrDefault(name.toLowerCase(), Command.ERR);
    }

}
