package com.svi.training.warcard;

public class Card 
{

	private String suitText, rankText;
	private int rankValue, suitValue, cardValue;


	public Card(String rankText, String suitText, int rankValue, int suitValue) 
	{
		this.rankText = rankText;
		this.suitText = suitText;
		this.rankValue = rankValue;
		this.suitValue = suitValue;
		this.cardValue = rankValue * 4 + suitValue * 1;
	}

	public Card(String rankText, String suitText) 
	{
		this.rankText = rankText;
		this.suitText = suitText;
	}

	
	public int getRankValue() 
	{
		return rankValue;
	}

	public int getSuitValue() 
	{
		return suitValue;
	}

	public String getSuitText() 
	{
		return suitText;
	}

	public String getRankText() 
	{
		return rankText;
	}

	@Override
	public String toString() 
	{
		return (rankText + "-" + suitText);
	}
	

	public int getCardValue() 
	{
		return cardValue;
	}

	public void setCardValue(int cardValue) 
	{
		this.cardValue = cardValue;
	}

	
}
