class Solution {
    public static int minCost(String colors, int[] neededTime) {
        int answer = 0;
        int count = 0;
        char[] colorsArray = colors.toCharArray();
        Map<Integer, List<Integer>> answerMap = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();
        boolean isFirst = true;

        // 동일한 색상의 연속된 풍선을 식별하기 위해 colors 배열을 반복
        for (int i = 0; i < colorsArray.length - 1; i++) {
            if (colorsArray[i] == colorsArray[i + 1]) {
                if (!isFirst) {
                    answerList.add(neededTime[i + 1]);
                } else {
                    answerList.add(neededTime[i + 1]);
                    answerList.add(neededTime[i]);
                    isFirst = false;
                }
            } else {
                answerMap.put(count, new ArrayList<>(answerList)); // 시간을 저장할 때 새 ArrayList를 사용
                answerList.clear();
                count++;
                isFirst = true;
            }
        }

        answerMap.put(count, new ArrayList<>(answerList)); // 마지막 일련의 풍선을 처리

        // 최소 필요 시간을 계산하기 위해 맵을 반복
        for (int i = 0; i <= count; i++) {
            List<Integer> realAnswerList = answerMap.get(i);
            if (realAnswerList != null && !realAnswerList.isEmpty()) {
                realAnswerList.remove(Collections.max(realAnswerList));
                for (Integer data : realAnswerList) {
                    answer += data;
                }
            }
        }

        return answer;
    }

}