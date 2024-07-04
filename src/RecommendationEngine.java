import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine {
    public List<User> recommendedFriends(User user, Graph graph) {
        List<User> recommendation = new ArrayList<>();

        for (User potentialFriendUser : graph.getUsers()) {
            if (!user.getFriends().contains(potentialFriendUser) && !user.equals(potentialFriendUser)) {
                double similarity = calculateSimilarity(user, potentialFriendUser);
                if (similarity > 0.3) {
                    recommendation.add(potentialFriendUser);
                }
            }
        }
        return recommendation;
    }

    private double calculateSimilarity(User user1, User user2) {
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor - " + resp);
        return resp;
    }
}
