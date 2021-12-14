package com.monocept.abstractFactory;

public interface OSFactory {

	Phone create(ManufacturerType manufacturerType);
}