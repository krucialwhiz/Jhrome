
package org.sexydock.tabs.event;

import org.sexydock.tabs.ITab;
import org.sexydock.tabs.TabbedPane;

public class TabMovedEvent extends TabbedPaneEvent
{
	public TabMovedEvent( TabbedPane tabbedPane , long timestamp , ITab movedTab , int prevIndex , int newIndex )
	{
		super( tabbedPane , timestamp );
		this.movedTab = movedTab;
		this.prevIndex = prevIndex;
		this.newIndex = newIndex;
	}
	
	public final ITab	movedTab;
	public final int	prevIndex;
	public final int	newIndex;
	
	public ITab getMovedTab( )
	{
		return movedTab;
	}
	
	public int getPrevIndex( )
	{
		return prevIndex;
	}
	
	public int getNewIndex( )
	{
		return newIndex;
	}
	
	@Override
	public String toString( )
	{
		return String.format( "%s[tabbedPane: %s, timestamp: %d, movedTab: %s, prevIndex: %d, newIndex: %d]" , getClass( ).getName( ) , tabbedPane , timestamp , movedTab , prevIndex , newIndex );
	}
}
