public class InitalOfName {
    public void printInitials(String str)
    {
        String[] name = str.split("\\s+");
        StringBuilder finalName = new StringBuilder();
        for (int i = 0; i < name.length; i++)
        {
            if(i == name.length-1 )
            {
                finalName.append(" ");
                finalName.append(name[i].toUpperCase().charAt(0));
                finalName.append(name[i].substring(1).toLowerCase());
            }
            else
            {
                finalName.append(name[i].toUpperCase().charAt(0)).append('.');
            }
        }
        System.out.println(finalName);

    }

    public static void main(String[] args) {
        InitalOfName initalOfName = new InitalOfName();
        initalOfName.printInitials("Parth Malhotra");
    }
}
