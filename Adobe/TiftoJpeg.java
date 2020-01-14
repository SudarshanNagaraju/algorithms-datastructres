package com.sixdee.test.Adobe;

import java.awt.image.RenderedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.media.jai.codec.FileSeekableStream;
import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageDecoder;
import com.sun.media.jai.codec.ImageEncoder;
import com.sun.media.jai.codec.JPEGEncodeParam;
import com.sun.media.jai.codec.SeekableStream;
import com.sun.media.jai.codec.TIFFDecodeParam;

public class TiftoJpeg {

	public static void main(String[] args) {
		try {
		
		SeekableStream s = new FileSeekableStream("E:\\Check\\Sample_1.tif");
        TIFFDecodeParam param = null;
        ImageDecoder dec = ImageCodec.createImageDecoder("tiff", s, param);
        RenderedImage op;
	
			op = dec.decodeAsRenderedImage(0);
		

        FileOutputStream fos = new FileOutputStream("E:\\Check\\CONVERT_1.jpeg");
        JPEGEncodeParam jpgparam = new JPEGEncodeParam();
        jpgparam.setQuality(67);
        ImageEncoder en = ImageCodec.createImageEncoder("jpeg", fos, jpgparam);
        en.encode(op);
        fos.flush();
        fos.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
