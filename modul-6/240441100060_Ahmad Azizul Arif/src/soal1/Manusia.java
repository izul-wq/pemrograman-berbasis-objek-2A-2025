package soal1;

abstract class Manusia {
    public abstract void berbicara();
    public abstract void bekerja();
    public abstract void makan();
}

class Joko extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Joko : Halo Saya Berbicara");
    }
    @Override
    public void bekerja(){
        System.out.println("Joko : Halo Saya Bekerja");
    }
    @Override
    public void makan(){
        System.out.println("Joko : Halo Saya Makan\n");
    }
}

class Beni extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Beni : Halo Saya Berbicara");
    }
    @Override
    public void bekerja(){
        System.out.println("Beni : Halo Saya Bekerja");
    }
    @Override
    public void makan(){
        System.out.println("Beni : Halo Saya Makan\n");
    }
}

class Fani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Fani : Halo Saya Berbicara");
    }
    public void bekerja(){
        System.out.println("Fani : Halo Saya Bekerja");
    }
    public void makan(){
        System.out.println("Fani : Halo Saya Makan\n");
    }
}

class Jani extends Manusia{
    @Override
    public void berbicara(){
        System.out.println("Jani : Halo Saya Berbicara");
    }
    @Override
    public void bekerja(){
        System.out.println("Jani : Halo Saya Bekerja");
    }
    @Override
    public void makan(){
        System.out.println("Jani : Halo Saya Makan\n");
    }
}