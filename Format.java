class Format {
  public static void main(String[] args) {
    java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
    System.out.println(nf.format(0.8055d));
  }
}
