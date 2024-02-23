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

package com.kodeco.kcf.loopcode

fun main(args: Array<String>) {
    println("For loop with range 1..3")
    // TODO: Write a for loop printing "Cleaning classroom $i..." for each value of i in range

    println()
    println("For loop with range 1..<3")
    // TODO: Write a for loop printing "Cleaning classroom $i..." for each value of i in range

    println()
    println("For loop with range 3..1")
    // TODO: Write a for loop printing "Cleaning classroom $i..." for each value of i in range

    println()
    println("For loop with range 3 downTo 1")
    // TODO: Write a for loop printing "Cleaning classroom $i..." for each value of i in range

    println()
    println("Count of classrooms to clean:")
    val classroomsToClean = args.firstOrNull()?.toIntOrNull()
        ?: throw IllegalArgumentException("Invalid input, please enter a number")

    val cleanedClassrooms = mutableListOf<Int>()
    println()
    println("While loop")
    // TODO: Write a while loop printing "Cleaning classroom $i..." for each classroom to clean

    println()
    println("Do-while loop")
    cleanedClassrooms.clear()
    // TODO: Write a do-while loop printing "Cleaning classroom $i..." for each classroom to clean

    println()
    println("Continue statement")
    // TODO: Write a for loop which skips classroom 2 cleaning

    println()
    println("Break statement")
    // TODO: Write a for loop which aborts cleaning after classroom 2
}
