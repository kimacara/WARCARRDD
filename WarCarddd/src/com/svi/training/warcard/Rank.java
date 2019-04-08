package com.svi.training.warcard;

public enum Rank 
{

		ACE(13, "ACE"), 
		KING(12, "KING"), 
		QUEEN(11, "QUEEN"), 
		JACK(10, "JACK"),	
		TEN(9, "10"), 
		NINE(8, "9"), 
		EIGHT(7, "8"), 
		SEVEN(6, "7"), 
		SIX(5, "6"), 
		FIVE(4, "5"), 
		FOUR(3, "4"), 
		THREE(2, "3"), 
		TWO(1, "2"); 

		private int rankValue; 
		private String rankText;
		
		private Rank(int rankValue, String rankText) 
		{ 
			this.rankValue = rankValue; 
			this.rankText = rankText;
		} 
		
		public String getRankText() 
		{
			return rankText;
		}
		
		public int getRankValue() 
		{ 
			return rankValue; 
		} 
}
