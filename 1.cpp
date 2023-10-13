class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        map <int,int> hash;
        for(int k=0;k<nums.size();k++){
            hash.insert(pair<int,int>(nums.at(k),k));
        }
        
        for(int i=0;i<nums.size();i++){
            int com=target-nums.at(i);
            auto itr=hash.find(com);
            if (itr!=hash.end() && itr->second!=i){
                 result.push_back(i);
                 result.push_back(itr->second);
                 return result;
            }
        }
        return vector<int>();
    }
};
