String str="Apple";
      String str2;
      str2=new StringBuffer(str).reverse().toString();
     str2=str2.replaceAll("[aeiou]", "");
        System.out.println(""+str2);