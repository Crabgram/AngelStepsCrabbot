package com.gikk.twirk.types.roomstate;

/**Class for representing a ROOMSTATE from Twitch.<br><br>
 * 
 * A ROOMSTATE means that there were some changes to the rooms attributes. When you first join a room, you will get a snapshot
 * of the rooms current ROOMSTATE. If changes occur, only the relevant changes will be included in the ROOMSTATE
 * A room has four different attributes <ul>
 * <li>broadcasterLanguage - The chat language when broadcaster language mode is enabled, and empty otherwise.
 * <li>r9k - R9K mode means that messages longer than 9 characters must be unique. Useful for supressing copypastas and avoid spamming long messages
 * <li>SubMode - Only subs and mods can write. 
 * <li>SlowMode - Only mods can post frequent, all others must wait a designated time between posting messages.
 * 
 * @author Gikkman
 *
 */
public interface Roomstate {	
	/** The chat language when broadcaster language mode is enabled, and empty otherwise.
	 * Might be null, if this ROOMSTATE had no information about it */
	public String getBroadcasterLanguage();
	/** If 1, it means that R9K mode is enabled. 0 means it is disabled. -1 means that this ROOMSTATE did not mention r9k */
	public int get9kMode();
	/** If 1, it means that sub mode is enabled. 0 means it is disabled. -1 means that this ROOMSTATE did not mention subMode */
	public int getSubMode();
	/** If greater than 0, it means that users must wait more than X seconds between posting messages. -1 means that this ROOMSTATE did not mention slowMode */
	public int getSlowModeTimer();

}
