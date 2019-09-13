class FakeSequence implements CharSequence{
  public int length() { return 1; }
  public char charAt(int position) { return 'a'; }
  public CharSequence subSequence (int start, int eind) { return this; }
  public String toString() { return "test"; }
} 
