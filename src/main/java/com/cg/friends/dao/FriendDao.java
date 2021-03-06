/**
 * 
 */
package com.cg.friends.dao;

import java.util.Map;

import com.cg.friends.model.FriendsBean;

/**
 * @author Nassruddin Khan
 *
 */
public interface FriendDao {

	/**
	 * @param bean
	 * @return
	 */
	Integer saveFriend(FriendsBean bean);
	 Map<?, ?> getMatualFriends(FriendsBean bean);
	/**
	 * @param friends
	 */
	/**
	 * @param bean
	 */
	int blockFriends(FriendsBean bean);
}
