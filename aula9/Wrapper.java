package aula9;

public class Wrapper {
    //#region Tipos Primitivos
    short num1 =1;
    byte num2=10;
    int num3 = 100;
    long num4 = 9459898;
    float num5 = 3.5f;
    double num6 = 3.5236;
    boolean flag = true;
    char a = 'a';
    //#endregion

    //#region Wrapper Class
    Short num7 =1;
    Byte num8 = Byte.valueOf(num2);
    Integer num9 = Integer.parseInt("295");
    Long num10 = Long.valueOf(num4);
    
    Boolean flag2 = Boolean.parseBoolean("true");
    Character b = Character.valueOf('H');
    Double num11 = Double.parseDouble("3.4");
    //#endregion
}
