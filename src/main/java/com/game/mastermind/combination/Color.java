package com.game.mastermind.combination;

enum Color {
   RED('r'), BLUE('b'), YELLOW('y'), GREEN('g'), ORANGE('o'), PURPLE('p');

   public char color;

    Color(char color) {
      this.color = color;
   }

   public char getColor(){
      return color;
   }

   public static Color getColor(char color){
      for (Color c : Color.values()) {
         if (c.color == color) {
            return c;
         }
      }
      return null;
   }

   public static boolean containsColor(char test) {

      for (Color c : Color.values()) {
         if (c.color == test) {
            return true;
         }
      }
      return false;
   }

}
