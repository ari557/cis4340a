boolean Capital(String s){
  if (s == null){
    throw new NullPointerException();
  }
  if (s.equals("")){
    return true;
  }
  String first= s.substring(0, 1);
  String remaining= s.substring(1);
  return (first.equals(first.toUpperCase()) && remaining.equals(remaining.toLowerCase()));
}
