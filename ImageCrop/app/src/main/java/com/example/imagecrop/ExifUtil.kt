package com.example.imagecrop

import android.graphics.BitmapFactory
import java.io.File
import java.text.SimpleDateFormat
import java.util.Locale

/**
 * File Exif Metadata Structure Utility
 *
 */
object ExifUtil {

    /**
     * @param file File
     * @return Image Info
     */
    fun getFileInfo(file: File?): String {
        if (file == null || !file.exists()) {
            return "Image doesn't exist / Select an Image from Gallery"
        }

        val resolution = getImageResolution(file)
        val sdf = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a", Locale.getDefault())
        val modified = sdf.format(file.lastModified())
        return StringBuilder()
            .append("Resolution: ")
            .append("${resolution.first}x${resolution.second}")
            .append("\n\n")

            .append("File Size: ")
            .append(getFileSize(file))
            .append("\n\n")

            .append("last Modified: ")
            .append(modified)
            .append("\n\n")

            .append("File Path: ")
            .append(file.absolutePath)
            .toString()
    }

    private fun getFileSize(file: File): String {
        val fileSize = file.length().toFloat()
        val mb = fileSize / (1024 * 1024)
        val kb = fileSize / (1024)

        return if (mb > 1) {
            "$mb MB"
        } else {
            "$kb KB"
        }
    }

    private fun getImageResolution(file: File): Pair<Int, Int> {
        val options = BitmapFactory.Options()
        options.inJustDecodeBounds = true
        BitmapFactory.decodeFile(file.absolutePath, options)
        return Pair(options.outWidth, options.outHeight)
    }
}
