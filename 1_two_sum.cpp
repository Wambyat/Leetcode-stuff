/**
* ! Brute force method

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int a = nums.size();
        for(int i;i<a;i++ ){
            for (int j;j<i;j++){
                if (nums[i] + nums[j] == target){
                    vector<int> result;
                    result.push_back(i);
                    result.push_back(j);
                    return result;
                }
            }
        }
            
    }   
};

** Using Hash table
*
* 
*/
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