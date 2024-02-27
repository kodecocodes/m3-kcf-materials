/*
 * Copyright (c) 2024 Kodeco LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.kodeco.kcf.whenexpressions

fun main(args: Array<String>) {
    val grade = args.firstOrNull()?.firstOrNull()
    val validGrades = setOf('A', 'B', 'C', 'D', 'F')

    println("Results using when without subject:")
    val result: Unit = when {
        grade !in validGrades -> throw IllegalArgumentException("Invalid grade")
        grade == 'A' -> println("Your grade is excellent")
        grade == 'B' -> println("You are very good")
        else -> {
            println("Your grade is lower than very good")
            println("Keep learning and improving!")
        }
    }
    println(result)

    println("Results using when statement:")
    when (grade) {
        'A' -> println("Your grade is excellent")
        'B' -> println("You are very good")
        'C' -> println("Your grade is Good")
        'D' -> println("Your grade is Acceptable")
        'F' -> println("You failed")
        else -> System.err.println("Unrecognized grade: $grade. Valid grades are A, B, C, D, and F.")
    }

    println("Results using when expression:")
    val message = when (grade) {
        'A' -> "Your grade is excellent"
        'B' -> "You are very good"
        'C' -> "Your grade is Good"
        'D' -> "Your grade is Acceptable"
        'F' -> "You failed"
        else -> {
            System.err.println("Unrecognized grade: $grade. Valid grades are A, B, C, D, and F.")
            "Your grade is unknown"
        }
    }
    println(message)
}
