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
    for (i in 1..3) {
        println("Cleaning classroom $i...")
    }

    println()
    println("For loop with range 1..<3")
    for (i in 1..<3) {
        println("Cleaning classroom $i...")
    }

    println()
    println("For loop with range 3..1")
    for (i in 3..1) {
        println("Cleaning classroom $i...")
    }

    println()
    println("For loop with range 3 downTo 1")
    for (i in 3 downTo 1) {
        println("Cleaning classroom $i...")
    }

    println()
    println("Count of classrooms to clean:")
    val classroomsToClean = args.firstOrNull()?.toIntOrNull()
        ?: throw IllegalArgumentException("Invalid input, please enter a number")

    val cleanedClassrooms = mutableListOf<Int>()
    println()
    println("While loop")
    while (cleanedClassrooms.size < classroomsToClean) {
        val currentClassroom = cleanedClassrooms.size + 1
        println("Cleaning classroom $currentClassroom...")
        cleanedClassrooms.add(currentClassroom)
    }

    println()
    println("Do-while loop")
    cleanedClassrooms.clear()
    do {
        val currentClassroom = cleanedClassrooms.size + 1
        println("Cleaning classroom $currentClassroom...")
        cleanedClassrooms.add(currentClassroom)
    } while (cleanedClassrooms.size < classroomsToClean)

    println()
    println("Continue statement")
    for (currentClassroom in 1..3) {
        if (currentClassroom == 2) {
            println("Skipping classroom $currentClassroom...")
            continue
        }
        println("Cleaning classroom $currentClassroom...")
    }

    println()
    println("Break statement")
    for (currentClassroom in 1..3) {
        if (currentClassroom == 2) {
            println("Breaking on classroom $currentClassroom...")
            break
        }
        println("Cleaning classroom $currentClassroom...")
    }
}
