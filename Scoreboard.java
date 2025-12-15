/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

*/
public class Scoreboard{
    private String t1Name;
    private String t2Name;
    private int t1Score;
    private int t2Score;
    private boolean t1Ort2;

    public Scoreboard(String o, String t){
        t1Name = o;
        t2Name = t;
        t1Score = 0;
        t2Score = 0;
        t1Ort2=true;
    }
    public void recordPlay(int scorePoints){
        if(scorePoints <= 0){
            t1Ort2 = !t1Ort2;
        } else{
            if(t1Ort2){
                t1Score += scorePoints;
            } else t2Score += scorePoints;
        }
    }
    public String getScore(){
        String currentTeam;
        if(t1Ort2){
            currentTeam = t1Name;
        } else currentTeam = t2Name;
        return t1Score+"-"+t2Score+"-"+currentTeam;
    }
}
// Write the class below