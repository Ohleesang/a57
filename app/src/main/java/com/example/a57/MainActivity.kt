package com.example.a57

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(answers: IntArray): IntArray {
                var result = intArrayOf(0,0,0)
                var answer = mutableListOf<Int>()

                var result_a = intArrayOf(1,2,3,4,5) //5
                var result_b = intArrayOf(2,1,2,3,2,4,2,5) // 8
                var result_c = intArrayOf(3,3,1,1,2,2,4,4,5,5) //10
                //answers 값이랑 각 자릿수를 비교하면됨
                for(i in 0..answers.size-1){
                    if(result_a[i%5]==answers[i]) result[0]++
                    if(result_b[i%8]==answers[i]) result[1]++
                    if(result_c[i%10]==answers[i]) result[2]++
                }
                //가장 높은 점수를 받은 사람을 return, 중복되면 오름차순으로
                var max = result.maxOf{it.toInt()}
                for(i in 0..2){
                    if(max==result[i]) answer.add(i+1)
                }
                return answer.toIntArray()

            }
        }
        val a = Solution()
        a.solution(intArrayOf(1,2,3,4,5))
        a.solution(intArrayOf(1,3,2,4,2))
    }
}