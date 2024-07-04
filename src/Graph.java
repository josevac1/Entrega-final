
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Graph {
    List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public Graph() {
        this.users = new LinkedList<>();
    }

    public User addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
        return user;
    }

    public void addConnection(User user1, User user2) {
        if (users.contains(user1) && users.contains(user2) && user1 != user2) {
            user1.addFriend(user2);
            user2.addFriend(user1);
        }
    }

    public void printGraph(){
        for(User node: users){
            System.out.print("Vertex"+ node.getName()+" :" );
            for(User friend :node.getFriends()){
                System.out.print("->"+ friend.getName());
            }
            System.out.println();
        }

    }

    public List<User> getFriends(User user) {
        if (users.contains(user)) {
            return user.getFriends();
        }
        return new LinkedList<>();
    }

    public List<User> recommendFriends(User user) {
        Set<User> recommended = new HashSet<>();
        List<User> friends = getFriends(user);

        for (User friend : friends) {
            for (User friendsOfFriend : friend.getFriends()) {
                if (!friends.contains(friendsOfFriend) && !friendsOfFriend.equals(user)) {
                    recommended.add(friendsOfFriend);
                }
            }
        }

        return new LinkedList<>(recommended);
    }
}
