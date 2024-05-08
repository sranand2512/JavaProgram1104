package April.ex_25042024;

public class L83_IQ_switch {
    public static void main(String[] args) {

        int a = 10;
        switch (a){
          // allowed
        }
        char ch = 'a';
        switch (ch){
            // char is also allowed
        }
         float f = 36.7f;
        switch((int)f){
           // float in no allowed
            // but using narrowing explicit typecasting it is done
        }

        double d = 30.0;
        switch ((int)d){
            // not allowed but can be done using typecasting
        }

      //  boolean b = true ;
      //  switch (b){
            // not allowed
      //  }

        long l = 30l;
        switch ((int)l){
            // allowed by typecasting
        }
        // enum and long and wrapper class come later
    }
}
