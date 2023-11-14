public class Movie {
    private String title;
    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie()
    {
        String name = this.getClass().getSimpleName();
        System.out.println(title+" is an instant type of "+name);
    }
}
class Adventure extends Movie
{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Scary","Dramatic","Suspense");
        System.out.printf("%n");
    }
}
class Comedy extends Movie
{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Pleasant","Happy Ending","Funny");
        System.out.printf("%n");
    }
}
class Fiction extends Movie
{
    public Fiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Shocking","Science","Suspense");
        System.out.printf("%n");
    }
}