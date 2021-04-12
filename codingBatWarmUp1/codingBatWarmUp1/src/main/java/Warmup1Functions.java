public class Warmup1Functions {
    public String backAround(String str) {
        char add = str.charAt(str.length() - 1);
        String comp = add + str + add;
        return comp;
    }

    public String backAroundM(String str) {
        // Get the last char
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        if (n % 3 == 0) {
            return true;
        } else if (n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean or35M(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        String res = "";
        if (str.length() > 1) {
            String s = str.substring(0, 2);
            String result = s + str + s;
            res = result;
        } else if (str.length() == 1) {
            res = str + str + str;
        } else {
            res = "";
        }
        return res;

    }

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        } else {
            if (str.substring(0, 2).equals("hi")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
        // Could be written as: return ((temp1 < 0 && ...));
    }

    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            return true;
        } else {
            if (b >= 10 && b <= 20) {
                return true;
            } else {
                return false;
            }

        }
    }

    public String front3(String str) {
        if (str.length() > 2) {
            String kerk = str.substring(0, 3);
            String len = kerk + kerk + kerk;
            return len;
        } else {
            return str + str + str;
        }
    }

    public boolean mixStart(String str) {
        if (str.length() < 3)
            return false;
        String str1 = str.substring(0, 3);
        if (str1.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }

    }

    public String startOz(String str) {
        String include = "";
        int lock = 0;
        for (int i = 0; i < str.length(); i++) {
            if (lock == 0) {
                if (str.charAt(i) == ('o')) {
                    include += "o";
                    lock += 1;
                }
            } else {
                if (str.charAt(i) == ('z')) {
                    include += "z";
                }

            }


        }
        return include;


    }


    public String startOzMN(String str) {

        if (str.length() == 1)

            str = str.substring(0, 1);

        else if (str.length() == 0)

            str = "";
        else if (!(str.charAt(0) == 'o') && !(str.charAt(1) ==

                'z'))

            str = "";

        else if (str.charAt(0) == 'o' && str.charAt(1) != 'z')

            str = str.substring(0, 1);

        else if (str.charAt(1) == 'z' && str.charAt(0) != 'o')

            str = str.substring(1, 2);

        else if (str.charAt(0) == 'o' && str.charAt(1) == 'z')

            str = str.substring(0, 2);

        return str;


    }

    public int intMax(int a, int b, int c) {
        int largest = 0;
        if (a > c) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if (c > b) {
            return c;

        } else {
            return b;
        }
    }

    public String delDel(String str) {
        int len = str.length();
        String ret = "";
        String begin = "";
        String end = "";
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 3).equals("del")) {
                begin += str.charAt(i - 1);
                end = str.substring(i + 1, i + 4);
                ret = begin + end;
            }

        }
        return ret;
    }


    public String delDel2(String str) {
        int len = str.length();
        int lock = 0;
        String ret = "";
        String begin = "";
        String end = "";

        for (int i = 0; i < str.length() - 4; i++) {
            if (lock == 0) {
                if (str.substring(i, i + 3).equals("del")) {
                    lock = 1;
                    begin += str.charAt(i - 1);
                    end = str.substring(i + 3);
                    ret = begin + end;
                }
                return ret;
            }

        }
        return str;


    }
    public String delDel3(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }

    public boolean stringE(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e')
                count++;
        }
        if(count<4 && count>0)
            return true;
        return false;
    }
    public boolean lastDigit(int a, int b) {
        if(a%10 ==b%10)
            return true;
        return false;
    }
    public int max1020(int a, int b) {
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }

        if(a>=10 && a <= 20) return a;
        if(b >= 10 && b<= 20) return b;
        return 0;
    }
    public boolean in3050(int a, int b) {
        if(a<=40 && b<=40 && a>=30 && b>= 30){
            return true;
        }else if(a>= 40 && b>= 40 && a<=50 && b<= 50 ){
            return true;
        }else{
            return false;
        }
    }
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String res="";
        for(int k=0;k<str.length();k=k+n){
            res=res+str.charAt(k);
        }
        return res;
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return ((!weekday) || vacation);
    }



}