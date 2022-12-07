class Main {
  public static void main(String[] args) {
    Superhero hero1 = new Superhero("Superman", "Clark Kent", 1936, true);
    System.out.println(hero1);
    hero1.setRealName("Bruce Wayne");
    hero1.setCanFly(false);
    System.out.println(hero1.getOriginYear());
    System.out.println(hero1.isVeteran());
    System.out.println(hero1.changeName("Batman"));
    System.out.println(hero1);

    Superhero hero2 = new Superhero("Wonder Woman", "Some One", 1980);
    System.out.println(hero2);
    System.out.println(hero2.isVeteran());
  }
}